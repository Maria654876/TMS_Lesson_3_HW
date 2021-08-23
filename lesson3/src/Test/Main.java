package Test;

import Documents.ContractForDelivery;
import Documents.ContractWithAnEmployee;
import Documents.FinancialInvoice;

import java.util.Date;

/**
 * This class to create each of the document types, add them to the register and output information about the document
 */
public class Main {
    public static void main(String[] args) {

        ContractForDelivery contractForDelivery1=new ContractForDelivery();

        contractForDelivery1.numberDocument=1;
        contractForDelivery1.dateDocument= new Date(2000,02,02);
        contractForDelivery1.typeDocument="Прошел проверку";
        contractForDelivery1.numberProducts=234;

        ContractForDelivery contractForDelivery2=new ContractForDelivery();

        contractForDelivery2.numberDocument=2;
        contractForDelivery2.dateDocument= new Date(2000,03,02);
        contractForDelivery2.typeDocument="Прошел проверку";
        contractForDelivery2.numberProducts=245;

        ContractForDelivery contractForDelivery3=new ContractForDelivery();

        contractForDelivery3.numberDocument=3;
        contractForDelivery3.dateDocument= new Date(2000,05,12);
        contractForDelivery3.typeDocument="Прошел проверку";
        contractForDelivery3.numberProducts=435;

        ContractWithAnEmployee contractWithAnEmployee1=new ContractWithAnEmployee();

        contractWithAnEmployee1.numberDocument=1;
        contractWithAnEmployee1.dateDocument=new Date(2000,05,03);
        contractWithAnEmployee1.employeeName="Виктор Николаев";
        contractWithAnEmployee1.contractStartDate=new Date(2000,06,05);
        contractWithAnEmployee1.contractEndDate=new Date(2000,11,23);

        ContractWithAnEmployee contractWithAnEmployee2=new ContractWithAnEmployee();

        contractWithAnEmployee2.numberDocument=2;
        contractWithAnEmployee2.dateDocument=new Date(2000,07,03);
        contractWithAnEmployee2.employeeName="Анна Петрова";
        contractWithAnEmployee2.contractStartDate=new Date(2000,10,05);
        contractWithAnEmployee2.contractEndDate=new Date(2000,12,23);

        ContractWithAnEmployee contractWithAnEmployee3=new ContractWithAnEmployee();

        contractWithAnEmployee3.numberDocument=3;
        contractWithAnEmployee3.dateDocument=new Date(2000,11,03);
        contractWithAnEmployee3.employeeName="Дмитрий Иванов ";
        contractWithAnEmployee3.contractStartDate=new Date(2000,11,05);
        contractWithAnEmployee3.contractEndDate=new Date(2000,12,23);

        FinancialInvoice financialInvoice1=new FinancialInvoice();

        financialInvoice1.numberDocument=341;
        financialInvoice1.departmentCode=4523;
        financialInvoice1.totalAmountForMonth=32455.23;
        financialInvoice1.dateDocument=new Date(2001,02,9);

        FinancialInvoice financialInvoice2=new FinancialInvoice();

        financialInvoice2.numberDocument=365;
        financialInvoice2.departmentCode=4323;
        financialInvoice2.totalAmountForMonth=34356.23;
        financialInvoice2.dateDocument=new Date(2001,03,9);

        FinancialInvoice financialInvoice3=new FinancialInvoice();

        financialInvoice3.numberDocument=456;
        financialInvoice3.departmentCode=6887;
        financialInvoice3.totalAmountForMonth=56745.23;
        financialInvoice3.dateDocument=new Date(2001,04,01);

        FinancialInvoice financialInvoice4=new FinancialInvoice();

        financialInvoice4.numberDocument=576;
        financialInvoice4.departmentCode=8677;
        financialInvoice4.totalAmountForMonth=67555.23;
        financialInvoice4.dateDocument=new Date(2001,05,06);


    }
}
