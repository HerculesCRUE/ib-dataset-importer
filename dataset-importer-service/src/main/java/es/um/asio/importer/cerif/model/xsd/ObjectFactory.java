//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.03 a las 10:33:46 AM CEST 
//


package es.um.asio.importer.cerif.model.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.um.asio.importer.cerif.model.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Person_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "Person");
    private final static QName _OrgUnit_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "OrgUnit");
    private final static QName _ProjectFundingSubstitutionGroupHead_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "ProjectFunding__SubstitutionGroupHead");
    private final static QName _Project_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "Project");
    private final static QName _Funding_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "Funding");
    private final static QName _ResearchOutputSubstitutionGroupHead_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "ResearchOutput__SubstitutionGroupHead");
    private final static QName _Publication_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "Publication");
    private final static QName _Patent_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "Patent");
    private final static QName _Product_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "Product");
    private final static QName _Event_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "Event");
    private final static QName _InfrastructureSubstitutionGroupHead_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "Infrastructure__SubstitutionGroupHead");
    private final static QName _Equipment_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "Equipment");
    private final static QName _Tech_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "Tech");
    private final static QName _Award_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "Award");
    private final static QName _Standard_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "Standard");
    private final static QName _Service_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "Service");
    private final static QName _SemanticLayerSubstitutionGroupHead_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "SemanticLayer__SubstitutionGroupHead");
    private final static QName _ClassScheme_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "ClassScheme");
    private final static QName _Class_QNAME = new QName("https://www.openaire.eu/cerif-profile/1.1/", "Class");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.um.asio.importer.cerif.model.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CfClassBaseType }
     * 
     */
    public CfClassBaseType createCfClassBaseType() {
        return new CfClassBaseType();
    }

    /**
     * Create an instance of {@link ClassScheme }
     * 
     */
    public ClassScheme createClassScheme() {
        return new ClassScheme();
    }

    /**
     * Create an instance of {@link Standard }
     * 
     */
    public Standard createStandard() {
        return new Standard();
    }

    /**
     * Create an instance of {@link Award }
     * 
     */
    public Award createAward() {
        return new Award();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Patent }
     * 
     */
    public Patent createPatent() {
        return new Patent();
    }

    /**
     * Create an instance of {@link Publication }
     * 
     */
    public Publication createPublication() {
        return new Publication();
    }

    /**
     * Create an instance of {@link Funding }
     * 
     */
    public Funding createFunding() {
        return new Funding();
    }

    /**
     * Create an instance of {@link Project }
     * 
     */
    public Project createProject() {
        return new Project();
    }

    /**
     * Create an instance of {@link Project.Funded }
     * 
     */
    public Project.Funded createProjectFunded() {
        return new Project.Funded();
    }

    /**
     * Create an instance of {@link OrgUnit }
     * 
     */
    public OrgUnit createOrgUnit() {
        return new OrgUnit();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link ProjectFundingBaseType }
     * 
     */
    public ProjectFundingBaseType createProjectFundingBaseType() {
        return new ProjectFundingBaseType();
    }

    /**
     * Create an instance of {@link ResearchOutputBaseType }
     * 
     */
    public ResearchOutputBaseType createResearchOutputBaseType() {
        return new ResearchOutputBaseType();
    }

    /**
     * Create an instance of {@link InfrastructureBaseType }
     * 
     */
    public InfrastructureBaseType createInfrastructureBaseType() {
        return new InfrastructureBaseType();
    }

    /**
     * Create an instance of {@link Equipment }
     * 
     */
    public Equipment createEquipment() {
        return new Equipment();
    }

    /**
     * Create an instance of {@link Tech }
     * 
     */
    public Tech createTech() {
        return new Tech();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link SemanticLayerBaseType }
     * 
     */
    public SemanticLayerBaseType createSemanticLayerBaseType() {
        return new SemanticLayerBaseType();
    }

    /**
     * Create an instance of {@link Class }
     * 
     */
    public Class createClass() {
        return new Class();
    }

    /**
     * Create an instance of {@link CfClassBaseType.Broader }
     * 
     */
    public CfClassBaseType.Broader createCfClassBaseTypeBroader() {
        return new CfClassBaseType.Broader();
    }

    /**
     * Create an instance of {@link CfClassBaseType.Narrower }
     * 
     */
    public CfClassBaseType.Narrower createCfClassBaseTypeNarrower() {
        return new CfClassBaseType.Narrower();
    }

    /**
     * Create an instance of {@link CfClassBaseType.Related }
     * 
     */
    public CfClassBaseType.Related createCfClassBaseTypeRelated() {
        return new CfClassBaseType.Related();
    }

    /**
     * Create an instance of {@link CfClassBaseType.Link }
     * 
     */
    public CfClassBaseType.Link createCfClassBaseTypeLink() {
        return new CfClassBaseType.Link();
    }

    /**
     * Create an instance of {@link ClassScheme.Link }
     * 
     */
    public ClassScheme.Link createClassSchemeLink() {
        return new ClassScheme.Link();
    }

    /**
     * Create an instance of {@link Standard.EquivalentTo }
     * 
     */
    public Standard.EquivalentTo createStandardEquivalentTo() {
        return new Standard.EquivalentTo();
    }

    /**
     * Create an instance of {@link Award.Authors }
     * 
     */
    public Award.Authors createAwardAuthors() {
        return new Award.Authors();
    }

    /**
     * Create an instance of {@link Event.Organizer }
     * 
     */
    public Event.Organizer createEventOrganizer() {
        return new Event.Organizer();
    }

    /**
     * Create an instance of {@link Event.Sponsor }
     * 
     */
    public Event.Sponsor createEventSponsor() {
        return new Event.Sponsor();
    }

    /**
     * Create an instance of {@link Event.Partner }
     * 
     */
    public Event.Partner createEventPartner() {
        return new Event.Partner();
    }

    /**
     * Create an instance of {@link Product.DOI }
     * 
     */
    public Product.DOI createProductDOI() {
        return new Product.DOI();
    }

    /**
     * Create an instance of {@link Product.Creators }
     * 
     */
    public Product.Creators createProductCreators() {
        return new Product.Creators();
    }

    /**
     * Create an instance of {@link Product.Publishers }
     * 
     */
    public Product.Publishers createProductPublishers() {
        return new Product.Publishers();
    }

    /**
     * Create an instance of {@link Product.PartOf }
     * 
     */
    public Product.PartOf createProductPartOf() {
        return new Product.PartOf();
    }

    /**
     * Create an instance of {@link Product.OriginatesFrom }
     * 
     */
    public Product.OriginatesFrom createProductOriginatesFrom() {
        return new Product.OriginatesFrom();
    }

    /**
     * Create an instance of {@link Product.GeneratedBy }
     * 
     */
    public Product.GeneratedBy createProductGeneratedBy() {
        return new Product.GeneratedBy();
    }

    /**
     * Create an instance of {@link Product.PresentedAt }
     * 
     */
    public Product.PresentedAt createProductPresentedAt() {
        return new Product.PresentedAt();
    }

    /**
     * Create an instance of {@link Product.Coverage }
     * 
     */
    public Product.Coverage createProductCoverage() {
        return new Product.Coverage();
    }

    /**
     * Create an instance of {@link Product.References }
     * 
     */
    public Product.References createProductReferences() {
        return new Product.References();
    }

    /**
     * Create an instance of {@link Patent.Inventors }
     * 
     */
    public Patent.Inventors createPatentInventors() {
        return new Patent.Inventors();
    }

    /**
     * Create an instance of {@link Patent.Holders }
     * 
     */
    public Patent.Holders createPatentHolders() {
        return new Patent.Holders();
    }

    /**
     * Create an instance of {@link Patent.OriginatesFrom }
     * 
     */
    public Patent.OriginatesFrom createPatentOriginatesFrom() {
        return new Patent.OriginatesFrom();
    }

    /**
     * Create an instance of {@link Patent.Predecessor }
     * 
     */
    public Patent.Predecessor createPatentPredecessor() {
        return new Patent.Predecessor();
    }

    /**
     * Create an instance of {@link Patent.References }
     * 
     */
    public Patent.References createPatentReferences() {
        return new Patent.References();
    }

    /**
     * Create an instance of {@link Publication.PublishedIn }
     * 
     */
    public Publication.PublishedIn createPublicationPublishedIn() {
        return new Publication.PublishedIn();
    }

    /**
     * Create an instance of {@link Publication.PartOf }
     * 
     */
    public Publication.PartOf createPublicationPartOf() {
        return new Publication.PartOf();
    }

    /**
     * Create an instance of {@link Publication.DOI }
     * 
     */
    public Publication.DOI createPublicationDOI() {
        return new Publication.DOI();
    }

    /**
     * Create an instance of {@link Publication.ISSN }
     * 
     */
    public Publication.ISSN createPublicationISSN() {
        return new Publication.ISSN();
    }

    /**
     * Create an instance of {@link Publication.ISBN }
     * 
     */
    public Publication.ISBN createPublicationISBN() {
        return new Publication.ISBN();
    }

    /**
     * Create an instance of {@link Publication.Authors }
     * 
     */
    public Publication.Authors createPublicationAuthors() {
        return new Publication.Authors();
    }

    /**
     * Create an instance of {@link Publication.Editors }
     * 
     */
    public Publication.Editors createPublicationEditors() {
        return new Publication.Editors();
    }

    /**
     * Create an instance of {@link Publication.Publishers }
     * 
     */
    public Publication.Publishers createPublicationPublishers() {
        return new Publication.Publishers();
    }

    /**
     * Create an instance of {@link Publication.OriginatesFrom }
     * 
     */
    public Publication.OriginatesFrom createPublicationOriginatesFrom() {
        return new Publication.OriginatesFrom();
    }

    /**
     * Create an instance of {@link Publication.PresentedAt }
     * 
     */
    public Publication.PresentedAt createPublicationPresentedAt() {
        return new Publication.PresentedAt();
    }

    /**
     * Create an instance of {@link Publication.OutputFrom }
     * 
     */
    public Publication.OutputFrom createPublicationOutputFrom() {
        return new Publication.OutputFrom();
    }

    /**
     * Create an instance of {@link Publication.Coverage }
     * 
     */
    public Publication.Coverage createPublicationCoverage() {
        return new Publication.Coverage();
    }

    /**
     * Create an instance of {@link Publication.References }
     * 
     */
    public Publication.References createPublicationReferences() {
        return new Publication.References();
    }

    /**
     * Create an instance of {@link Funding.PartOf }
     * 
     */
    public Funding.PartOf createFundingPartOf() {
        return new Funding.PartOf();
    }

    /**
     * Create an instance of {@link Funding.OAMandate }
     * 
     */
    public Funding.OAMandate createFundingOAMandate() {
        return new Funding.OAMandate();
    }

    /**
     * Create an instance of {@link Project.Consortium }
     * 
     */
    public Project.Consortium createProjectConsortium() {
        return new Project.Consortium();
    }

    /**
     * Create an instance of {@link Project.Team }
     * 
     */
    public Project.Team createProjectTeam() {
        return new Project.Team();
    }

    /**
     * Create an instance of {@link Project.PartOf }
     * 
     */
    public Project.PartOf createProjectPartOf() {
        return new Project.PartOf();
    }

    /**
     * Create an instance of {@link Project.Uses }
     * 
     */
    public Project.Uses createProjectUses() {
        return new Project.Uses();
    }

    /**
     * Create an instance of {@link Project.OAMandate }
     * 
     */
    public Project.OAMandate createProjectOAMandate() {
        return new Project.OAMandate();
    }

    /**
     * Create an instance of {@link Project.Funded.As }
     * 
     */
    public Project.Funded.As createProjectFundedAs() {
        return new Project.Funded.As();
    }

    /**
     * Create an instance of {@link OrgUnit.Leader }
     * 
     */
    public OrgUnit.Leader createOrgUnitLeader() {
        return new OrgUnit.Leader();
    }

    /**
     * Create an instance of {@link OrgUnit.PartOf }
     * 
     */
    public OrgUnit.PartOf createOrgUnitPartOf() {
        return new OrgUnit.PartOf();
    }

    /**
     * Create an instance of {@link Person.PersonName }
     * 
     */
    public Person.PersonName createPersonPersonName() {
        return new Person.PersonName();
    }

    /**
     * Create an instance of {@link Person.Affiliation }
     * 
     */
    public Person.Affiliation createPersonAffiliation() {
        return new Person.Affiliation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "Person", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons", substitutionHeadName = "Person__SubstitutionGroupHead")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrgUnit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrgUnit }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "OrgUnit", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons", substitutionHeadName = "OrgUnit__SubstitutionGroupHead")
    public JAXBElement<OrgUnit> createOrgUnit(OrgUnit value) {
        return new JAXBElement<OrgUnit>(_OrgUnit_QNAME, OrgUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectFundingBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProjectFundingBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "ProjectFunding__SubstitutionGroupHead", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons", substitutionHeadName = "Individual__SubstitutionGroupHead")
    public JAXBElement<ProjectFundingBaseType> createProjectFundingSubstitutionGroupHead(ProjectFundingBaseType value) {
        return new JAXBElement<ProjectFundingBaseType>(_ProjectFundingSubstitutionGroupHead_QNAME, ProjectFundingBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Project }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Project }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "Project", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/1.1/", substitutionHeadName = "ProjectFunding__SubstitutionGroupHead")
    public JAXBElement<Project> createProject(Project value) {
        return new JAXBElement<Project>(_Project_QNAME, Project.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Funding }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Funding }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "Funding", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/1.1/", substitutionHeadName = "ProjectFunding__SubstitutionGroupHead")
    public JAXBElement<Funding> createFunding(Funding value) {
        return new JAXBElement<Funding>(_Funding_QNAME, Funding.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResearchOutputBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResearchOutputBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "ResearchOutput__SubstitutionGroupHead", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons", substitutionHeadName = "Individual__SubstitutionGroupHead")
    public JAXBElement<ResearchOutputBaseType> createResearchOutputSubstitutionGroupHead(ResearchOutputBaseType value) {
        return new JAXBElement<ResearchOutputBaseType>(_ResearchOutputSubstitutionGroupHead_QNAME, ResearchOutputBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Publication }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Publication }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "Publication", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/1.1/", substitutionHeadName = "ResearchOutput__SubstitutionGroupHead")
    public JAXBElement<Publication> createPublication(Publication value) {
        return new JAXBElement<Publication>(_Publication_QNAME, Publication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Patent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Patent }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "Patent", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/1.1/", substitutionHeadName = "ResearchOutput__SubstitutionGroupHead")
    public JAXBElement<Patent> createPatent(Patent value) {
        return new JAXBElement<Patent>(_Patent_QNAME, Patent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "Product", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/1.1/", substitutionHeadName = "ResearchOutput__SubstitutionGroupHead")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Event }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Event }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "Event", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons", substitutionHeadName = "Individual__SubstitutionGroupHead")
    public JAXBElement<Event> createEvent(Event value) {
        return new JAXBElement<Event>(_Event_QNAME, Event.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfrastructureBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InfrastructureBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "Infrastructure__SubstitutionGroupHead", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons", substitutionHeadName = "Individual__SubstitutionGroupHead")
    public JAXBElement<InfrastructureBaseType> createInfrastructureSubstitutionGroupHead(InfrastructureBaseType value) {
        return new JAXBElement<InfrastructureBaseType>(_InfrastructureSubstitutionGroupHead_QNAME, InfrastructureBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Equipment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Equipment }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "Equipment", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/1.1/", substitutionHeadName = "Infrastructure__SubstitutionGroupHead")
    public JAXBElement<Equipment> createEquipment(Equipment value) {
        return new JAXBElement<Equipment>(_Equipment_QNAME, Equipment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tech }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tech }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "Tech", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/1.1/", substitutionHeadName = "Infrastructure__SubstitutionGroupHead")
    public JAXBElement<Tech> createTech(Tech value) {
        return new JAXBElement<Tech>(_Tech_QNAME, Tech.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Award }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Award }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "Award", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons", substitutionHeadName = "Individual__SubstitutionGroupHead")
    public JAXBElement<Award> createAward(Award value) {
        return new JAXBElement<Award>(_Award_QNAME, Award.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Standard }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Standard }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "Standard", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/includes/Cerif_Commons", substitutionHeadName = "Individual__SubstitutionGroupHead")
    public JAXBElement<Standard> createStandard(Standard value) {
        return new JAXBElement<Standard>(_Standard_QNAME, Standard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Service }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "Service", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/1.1/", substitutionHeadName = "Infrastructure__SubstitutionGroupHead")
    public JAXBElement<Service> createService(Service value) {
        return new JAXBElement<Service>(_Service_QNAME, Service.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SemanticLayerBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SemanticLayerBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "SemanticLayer__SubstitutionGroupHead")
    public JAXBElement<SemanticLayerBaseType> createSemanticLayerSubstitutionGroupHead(SemanticLayerBaseType value) {
        return new JAXBElement<SemanticLayerBaseType>(_SemanticLayerSubstitutionGroupHead_QNAME, SemanticLayerBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassScheme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClassScheme }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "ClassScheme", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/1.1/", substitutionHeadName = "SemanticLayer__SubstitutionGroupHead")
    public JAXBElement<ClassScheme> createClassScheme(ClassScheme value) {
        return new JAXBElement<ClassScheme>(_ClassScheme_QNAME, ClassScheme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Class }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Class }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.openaire.eu/cerif-profile/1.1/", name = "Class", substitutionHeadNamespace = "https://www.openaire.eu/cerif-profile/1.1/", substitutionHeadName = "SemanticLayer__SubstitutionGroupHead")
    public JAXBElement<Class> createClass(Class value) {
        return new JAXBElement<Class>(_Class_QNAME, Class.class, null, value);
    }

}
