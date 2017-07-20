package com.camunda.consulting.pipedriveclient.pojo;

import com.camunda.consulting.connectors.pipedrive.pojo.GenericDeal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CamundaPipedriveDeal extends GenericDeal {

	@JsonProperty("2b7f0a5db7e899b9c15a2fb02cb690ac2b123076")
	private String start_date;

	@JsonProperty("7a00f18c0cb3f7c90e849d1a5e8a22b5db48cbde")
	private String end_date;

	@JsonProperty("06924908993f71b1c34168d20fbd051543584a67")
	private String consultant;

	@JsonProperty("7704a7f90d1eb8244ff563d9a6924cc099b08d26")
	private String salesforceId;

	@JsonProperty("b04655283486715a426dafab9c18d1f8488a7480")
	private String customerOrderId;

	private String hourlyRate; // comes from product

	private String budget; // comes from product

	@JsonProperty("7086b7a0660778edfd4078d587f7f9064ebf5538")
	private String eventAddress;

	private String customerContact; // invoice contact person

	private String contactMail; // invoice Mail address

	private String customerPhone;

	private String product;

	@JsonProperty("53883986b1093bd551ec4c35ea88c6beece94773")
	private String paymentDueInDays;

	@JsonProperty("1890af7c09fd96b870947f2d88494cc4c053b7da")
	private String invoiceAddress;

	@JsonProperty("40f21a63cd068847a07dcf6c77673922ff09bd06")
	private String invoiceMail;

	private int numberOfProducts;

	private String largestProduct;
	
	@JsonProperty("ac42158b63f1136052ccb5901d22cd31bff0a5b2")
	private int consultingHoursIncluded;

	public CamundaPipedriveDeal() {
		super();
	}

	public int getConsultingHoursIncluded() {
		return consultingHoursIncluded;
	}

	public void setConsultingHoursIncluded(int consultingHoursIncluded) {
		this.consultingHoursIncluded = consultingHoursIncluded;
	}

	public String getInvoiceMail() {
		return invoiceMail;
	}

	public void setInvoiceMail(String invoiceMail) {
		this.invoiceMail = invoiceMail;
	}

	public String getPaymentDueInDays() {
		return paymentDueInDays;
	}

	public void setPaymentDueInDays(String paymentDueInDays) {
		this.paymentDueInDays = paymentDueInDays;
	}

	public String getInvoiceAddress() {
		return invoiceAddress;
	}

	public void setInvoiceAddress(String invoiceAddress) {
		this.invoiceAddress = invoiceAddress;
	}

	public boolean isRemote() {
		return remote;
	}

	public void setRemote(boolean remote) {
		this.remote = remote;
	}

	private boolean remote;

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getConsultant() {
		return consultant;
	}

	public void setConsultant(String consultant) {
		this.consultant = consultant;
	}

	public String getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(String customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public String getSalesforceId() {
		return salesforceId;
	}

	public void setSalesforceId(String salesforceId) {
		this.salesforceId = salesforceId;
	}

	public String getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(String hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getEventAddress() {
		return eventAddress;
	}

	public void setEventAddress(String eventAddress) {
		this.eventAddress = eventAddress;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public String getContactMail() {
		return contactMail;
	}

	public void setContactMail(String contactMail) {
		this.contactMail = contactMail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public int getNumberOfProducts() {
		return numberOfProducts;
	}

	public void setNumberOfProducts(int numberOfProducts) {
		this.numberOfProducts = numberOfProducts;
	}

	public String getLargestProduct() {
		return largestProduct;
	}

	public void setLargestProduct(String largestProduct) {
		this.largestProduct = largestProduct;
	}
	
	@Override
	public String toString() {
		return "CamundaPipedriveDeal [start_date=" + start_date + ", end_date=" + end_date + ", consultant="
				+ consultant + ", salesforceId=" + salesforceId + ", customerOrderId=" + customerOrderId
				+ ", hourlyRate=" + hourlyRate + ", budget=" + budget + ", eventAddress=" + eventAddress
				+ ", customerContact=" + customerContact + ", contactMail=" + contactMail + ", customerPhone="
				+ customerPhone + ", product=" + product + ", paymentDueInDays=" + paymentDueInDays
				+ ", invoiceAddress=" + invoiceAddress + ", invoiceMail=" + invoiceMail + ", numberOfProducts="
				+ numberOfProducts + ", largestProduct=" + largestProduct + ", consultingHoursIncluded="
				+ consultingHoursIncluded + ", remote=" + remote + "]";
	}
}
