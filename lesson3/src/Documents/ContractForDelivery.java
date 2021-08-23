package Documents;

import Interface.IDocumentContractForDelivery;
import Test.Document;

import java.sql.SQLOutput;
import java.util.Date;

/**
 * This class is created for documents of the contract for the delivery
 */
public class ContractForDelivery extends Document implements IDocumentContractForDelivery {

    public String typeDocument;
    public int numberProducts;

    @Override
    public void ContractForDelivery(String typeDocument, int numberProducts, int numberDocument, Date dateDocument) {
        this.typeDocument=typeDocument;
        this.numberProducts=numberProducts;
        this.numberDocument=numberDocument;
        this.dateDocument=dateDocument;
    }

    @Override
    public void ContractForDelivery(String typeDocument, int numberProducts) {

    }

    public String toString(){
        return numberDocument+""+dateDocument+""+typeDocument+""+numberProducts+"";
    }

}
