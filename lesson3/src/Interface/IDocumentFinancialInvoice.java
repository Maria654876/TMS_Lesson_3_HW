package Interface;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The interface was created to specify methods with parameters
 */

public interface IDocumentFinancialInvoice {
    void FinancialInvoice(double totalAmountForMonth, int departmentCode, int numberDocument, Date dateDocument);
    void FinancialInvoice(int departmentCode);
    void FinancialInvoice();
}
