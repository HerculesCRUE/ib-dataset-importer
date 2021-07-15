package es.um.asio.importer.cerif.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Person", namespace = "https://www.openaire.eu/cerif-profile/1.1/")
public class Person {

	protected String id2;
	protected Person.PersonName PersonName;
	protected String Gender;
	protected String ElectronicAddress;
	protected OrgUnit Affiliation;

	/**
	 * @return the id2
	 */
	public String getId2() {
		return id2;
	}

	/**
	 * @param id2 the id2 to set
	 */
	public void setId2(String id2) {
		this.id2 = id2;
	}

	/**
	 * @return the personName
	 */
	public Person.PersonName getPersonName() {
		return PersonName;
	}

	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(Person.PersonName personName) {
		PersonName = personName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}

	/**
	 * @return the electronicAddress
	 */
	public String getElectronicAddress() {
		return ElectronicAddress;
	}

	/**
	 * @param electronicAddress the electronicAddress to set
	 */
	public void setElectronicAddress(String electronicAddress) {
		ElectronicAddress = electronicAddress;
	}

	/**
	 * @return the affiliation
	 */
	public OrgUnit getAffiliation() {
		return Affiliation;
	}

	/**
	 * @param affiliation the affiliation to set
	 */
	public void setAffiliation(OrgUnit affiliation) {
		Affiliation = affiliation;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {

	})
	public static class PersonName {

		protected String FamilyNames;
		protected String FirstNames;
		protected String OtherNames;

		/**
		 * @return the familyNames
		 */
		public String getFamilyNames() {
			return FamilyNames;
		}

		/**
		 * @param familyNames the familyNames to set
		 */
		public void setFamilyNames(String familyNames) {
			FamilyNames = familyNames;
		}

		/**
		 * @return the firstNames
		 */
		public String getFirstNames() {
			return FirstNames;
		}

		/**
		 * @param firstNames the firstNames to set
		 */
		public void setFirstNames(String firstNames) {
			FirstNames = firstNames;
		}

		/**
		 * @return the otherNames
		 */
		public String getOtherNames() {
			return OtherNames;
		}

		/**
		 * @param otherNames the otherNames to set
		 */
		public void setOtherNames(String otherNames) {
			OtherNames = otherNames;
		}

	}

}