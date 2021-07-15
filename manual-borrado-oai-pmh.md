![](/Users/rgavilan/projects/murcia/wrk_asio/dataset-importer/images/logos_feder.png)



| Entregable   | Manual ejecución de importadores                             |
| ------------ | ------------------------------------------------------------ |
| Fecha        | 12/07/2021                                                   |
| Revisado por | Paloma Terán Pérez                                           |
| Proyecto     | [ASIO](https://www.um.es/web/hercules/proyectos/asio) (Arquitectura Semántica e Infraestructura Ontológica) en el marco de la iniciativa [Hércules](https://www.um.es/web/hercules/) para la Semántica de Datos de Investigación de Universidades que forma parte de [CRUE-TIC](https://www.crue.org/proyecto/hercules/) |
| Módulo       | Importador base                                              |
| Tipo         | Software                                                     |
| Objetivo     | Manual borrado OAI-PMH                                       |
| Estado       | **100%**                                                     |

# Manual borrado OAI-PMH

En el presente documento se hace referencia a cómo se realiza el borrado de los datos provenientes de OAI-PMH.

## Recepción de borrados a través de OAI-PMH

OAI-PMH provee de diferentes endpoints que permiten recuperar la información. El primero de ellos es el denominado `ListIdentifiers` (http://www.openarchives.org/OAI/openarchivesprotocol.html#ListIdentifiers) el cual proporciona la lista de identificadores que se han creado, modificado o añadido en un rango de fechas. 

Como resultado devolverá un XML con una estructura:

- **responseDate**: Es la fecha de la respuesta, deberá coincidir con el parámetro *from*. 
  - **ListIdentifiers**: Contiene el listado de identificadores que se han modificado entre las fechas enviadas por parámetro. 
    - **header**: Identifica cada item. El atributo status="deleted” indicará si ese ítem ha sido borrado. 
    - **identifier**: El identificador único, con este podremos llamar a GetRecord. 
    - **datestamp**: La fecha de modificación del ítem. 

```xml
<?xml version="1.0" encoding="UTF-8"?>
<OAI-PMH xmlns="http://www.openarchives.org/OAI/2.0/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.openarchives.org/OAI/2.0/ http://www.openarchives.org/OAI/2.0/OAI-PMH.xsd">
   <responseDate>2002-06-01T19:30:00Z</responseDate>
   <request verb="ListIdentifiers" from="1998-01-15" />
   <ListIdentifiers>
      <header>
         <identifier>1</identifier>
         <datestamp>2020-04-23</datestamp>
      </header>
      <header>
         <identifier>2</identifier>
         <datestamp>2020-04-23</datestamp>
      </header>
      <header>
         <identifier>3</identifier>
         <datestamp>2020-04-23</datestamp>
      </header>
      <header status="deleted">
         <identifier>4</identifier>
         <datestamp>2020-04-23</datestamp>
      </header>
      <header>
         <identifier>5</identifier>
         <datestamp>2020-04-23</datestamp>
      </header>
   </ListIdentifiers>
</OAI-PMH>
```

Como hemos indicado anteriormente, en el caso que un registro venga borrado se le añade el atributo `status`al elemento `header`, por ejemplo en este caso el elemento con `identifier` 4 se borra:

```xml
      <header status="deleted">
         <identifier>4</identifier>
         <datestamp>2020-04-23</datestamp>
      </header>
```

### Detalle de registros

 Aunque no es necesario en el caso del borrado, se puede obtener el detalle de todos los registros, incluso de los borrados a través del endpoint `GetRecord`http://www.openarchives.org/OAI/openarchivesprotocol.html#GetRecord pasando el `identifier ` como parámetro.

El servicio retornará un XML con el siguiente formato:

- **responseDate**: Es la fecha de la respuesta, deberá coincidir con el parámetro *from*. 

- **GetRecord**: Contiene la información. 
  - **header**: El atributo status="deleted” indicará si ese ítem ha sido borrado, en este caso no se recibirá metadata. 
    - **identifier**: El identificador único, con este podremos llamar a GetRecord. 
    - **datestamp**: La fecha de modificación del ítem. 
  - Metadata: detalle del registro

En el caso de los borrados, no se recibirán los metadatos. Por ejemplo:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<OAI-PMH xmlns="http://www.openarchives.org/OAI/2.0/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.openarchives.org/OAI/2.0/ http://www.openarchives.org/OAI/2.0/OAI-PMH.xsd">
   <responseDate>2002-02-08T08:55:46Z</responseDate>
   <request verb="GetRecord" identifier="1" />
   <GetRecord>
      <record>
         <header status="deleted">
            <identifier>oai:arXiv.org:cs/0112017</identifier>
            <datestamp>2001-12-14</datestamp>
            <setSpec>cs</setSpec>
            <setSpec>math</setSpec>
         </header>
      </record>
   </GetRecord>
</OAI-PMH>
```

## Borrado de registro en triple store

Cuando se detecta uno de estos casos, se recoge el identificador del registro y se marca con la operación "DELETE" para proceder al borrado en fases posteriores, llegando a traducirse finalmente en un evento de borrado en el triple store.
