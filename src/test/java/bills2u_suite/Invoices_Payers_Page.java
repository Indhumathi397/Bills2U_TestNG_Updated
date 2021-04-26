package test.java.bills2u_suite;

import test.java.bills2u_process.Process_Class_Payer;

public class Invoices_Payers_Page extends Process_Class_Payer {

    public Invoices_Payers_Page TC_IN_168() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_168_Invoices page_Display details");
        payerLoginProcess();
        checkDisplayedItems();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_169() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_169_Invoices page_Pay for Individual invoice");
        payerLoginProcess();
        checkDueAmtAndDate();
        clickOnPayforSelected();
        closeButton();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_170() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_170_Invoices page_Pay for Multiple invoice");
        payerLoginProcess();
        clickOnSelectAllChkBox();
        checkTotalOutstanding();
        clickOnPayforSelected();
        closeButton();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_171() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_171_Invoices page_Pay button_Fully paid invoice");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_172() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_172_Invoices page_Pay button_Individual invoice_Partially paid invoice");
        payerLoginProcess();
        checkOnPayforSelected();
        clickOnPayforSelected();
        closeButton();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_173() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_173_Invoices page_Invoice in detail_Display details");
        payerLoginProcess();
        clickOnRespectiveInvNo();
        checkDisplayedItemsInID();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_174() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_174_Invoices page_Invoice in detail_Pay button");
        payerLoginProcess();
        clickOnRespectiveInvNo();
        checkOutstandingAmt();
        clickOnPayInID();
        closeButton();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_175() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_175_Invoices page_Invoice in detail_Invoice_Display details");
        payerLoginProcess();
        clickOnRespectiveInvNo();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_176() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_176_Invoices page_Invoice in detail_Payment History_Display details");
        payerLoginProcess();
        clickOnRespectiveInvNo();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_177() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_177_Invoices page_Invoice in detail_Payment History_Payment Receipt_Display details");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_178() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_178_Invoices page_Filter_Display details");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_179() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_179_Invoices page_Filter_Invoice Number");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_180() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_180_Invoices page_Filter_Due Date filter");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_181() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_181_Invoices page_Filter_Status filter_All");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_182() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_182_Invoices page_Filter_Status filter_Unpaid invoice");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_183() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_183_Invoices page_Filter_Status filter_Paid invoice");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_184() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_184_Invoices page_Filter_Status filter_None");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_185() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_185_Invoices page_Filter_Issuing Merchant filter_Selective merchants");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_186() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_186_Invoices page_Filter_Issuing Merchant filter_All");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_187() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_187_Invoices page_Filter_Issuing Merchant filter_None");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_188() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_188_Invoices page_Confirm payment pop-up_Display details");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_189() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_189_Invoices page_Confirm payment pop-up_Full payment");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_190() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_190_Invoices page_Confirm payment pop-up_Partial payment");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_191() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payer_191_Invoices page_Confirm payment pop-up_Partial payment disabled invoice");
        payerLoginProcess();
        logoutProcess();
        return this;
    }

    public Invoices_Payers_Page TC_IN_192() throws InterruptedException {
        testPayer=reportPayer.createTest("TC_BILLS2U_Payers_192_Invoices page_Tool tip");
        payerLoginProcess();
        logoutProcess();
        return this;
    }
}
