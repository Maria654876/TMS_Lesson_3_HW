package Interface;

import java.util.Date;

/**
 * The interface was created to specify methods with parameters
 */
public interface IDocumentContractWithAnEmployee {
    void ContractWithAnEmployee (Date contractStartDate, Date contractEndDate, String employeeName, int numberDocument, Date dateDocument);
    void ContractWithAnEmployee(String employeeName);
    void ContractWithAnEmployee();
}
