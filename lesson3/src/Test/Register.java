package Test;

import Documents.ContractForDelivery;

/**
 * The class is created to save the document in the register and provide information about the document
 */
public class Register {

    static Main [] doc =new Main[10];

    public static void main(String[] args) {
        doc[0]=new Main(contractForDelivery1);
      doc[1]=new Main(contractForDelivery2);
      doc[2]=new Main(contractForDelivery3);
      doc[3]=new Main(contractWithAnEmployee1);
      doc[4]=new Main(contractWithAnEmployee2);
      doc[5]=new Main(contractWithAnEmployee3);
      doc[6]=new Main(financialInvoice1);
      doc[7]=new Main(financialInvoice2);
      doc[8]=new Main(financialInvoice3);
      doc[9]=new Main(financialInvoice4);

      for(int i=0; i<doc.length; i++){
          System.out.println(doc[i]);
      }
    }
}
