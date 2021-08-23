package Documents;

import Interface.IDocumentContractWithAnEmployee;
import Test.Document;

import java.util.Date;

/**
 * This class is created for documents of the contract with an employee
 */

public class ContractWithAnEmployee extends Document implements IDocumentContractWithAnEmployee {
     public Date contractStartDate;
     public Date contractEndDate;
     public String employeeName;


     @Override
     public void ContractWithAnEmployee(Date contractStartDate, Date contractEndDate, String employeeName, int numberDocument, Date dateDocument) {
          this.contractStartDate=contractStartDate;
          this.contractEndDate=contractEndDate;
          this.employeeName=employeeName;
          this.dateDocument=dateDocument;
          this.numberDocument=numberDocument;
     }

     @Override
     public void ContractWithAnEmployee(String employeeName) {

     }

     @Override
     public void ContractWithAnEmployee() {

     }

     public String toString(){

          return  numberDocument+""+dateDocument+""+employeeName+""+contractStartDate+""+contractEndDate+"";
     }

}
