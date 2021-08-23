package Documents;

import Test.Document;
import Interface.IDocumentFinancialInvoice;

import java.math.BigDecimal;
import java.util.Date;

/**
 * This class is created for documents of the financial invoice
 */

public class FinancialInvoice extends Document implements IDocumentFinancialInvoice {
    public double totalAmountForMonth;
    public int departmentCode;


    @Override
    public void FinancialInvoice(double totalAmountForMonth, int departmentCode, int numberDocument, Date dateDocument) {
        this.totalAmountForMonth = totalAmountForMonth;
        this.departmentCode = departmentCode;
        this.dateDocument = dateDocument;
        this.numberDocument = numberDocument;
    }

    public String toString() {

        return numberDocument + "" + departmentCode + "" + totalAmountForMonth + "" + dateDocument + "";
    }

    @Override
    public void FinancialInvoice(int departmentCode) {

    }

    @Override
    public void FinancialInvoice() {

    }

}
