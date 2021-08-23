package Interface;

import java.util.Date;

/**
 * The interface was created to specify methods with parameters
 */

public interface IDocumentContractForDelivery {
    void ContractForDelivery(String typeDocument, int numberProducts, int numberDocument, Date dateDocument);
    void ContractForDelivery(String typeDocument, int numberProducts);
}
