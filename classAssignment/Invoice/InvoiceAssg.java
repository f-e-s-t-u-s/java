public class InvoiceAssg {
    public static void main(String[] args) {

        String soldTo = "C026-01-0913/2022";
        String address = "Festus Gitahi";
        String date = "28/04/2020";
        String contactNumber = "0100100100";

        int quantity1 = 4;
        int quantity2 = 10;
        int quantity3 = 9;
        int quantity4 = 10;

        String item1 = "Pencil";
        String item2 = "Duster";
        String item3 = "Pens";
        String item4 = "crayon";

        int price1 = 20;
        int price2 = 50;
        int price3 = 30;
        int price4 = 80;

        float amount1 = price1 * quantity1;
        float amount2 = price2 * quantity2;
        float amount3 = price3 * quantity3;
        float amount4 = price4 * quantity4;

        float subTotal = amount1 + amount2 + amount3 + amount4;
        float percent = 0.16f;
        float VAT = subTotal * percent;
        float totalAmount = subTotal + VAT;



        System.out.println("*************************Adamson Computers Ltd***************************");
        System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City  *  Tel. No:123-4567");
        System.out.println("                 VAT REG. TIN 098-765-4231-0000");
        System.out.println("                         SALES INVOICE");
        System.out.println();
        System.out.println("Sold to:" + soldTo + "                               Date:" + date);
        System.out.println("Address:" + address + "                           Contact Number:" + contactNumber);
        System.out.println();
        System.out.println("==============================================================================");
        System.out.println("Qty     |        Item Description       |        Unit Price     |Amount");
        System.out.println("==============================================================================");
        System.out.println(quantity1 + "       |          " + item1 + "               |        " + price1 + "             |" + String.format("%.2f", amount1));
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(quantity2 + "      |          " + item2 + "               |        " + price2 + "             |" + String.format("%.2f", amount2));
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(quantity3 + "       |          " + item3 + "                 |        " + price3 + "             |" + String.format("%.2f", amount3));
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(quantity4 + "      |          " + item4 + "               |        " + price4 + "             |" + String.format("%.2f", amount4));
        System.out.println("==============================================================================");
        System.out.println("                                                 |Sub Total     |" +String.format("%.2f", subTotal));
        System.out.println("                                                 =============================");
        System.out.println("                                                 |VAT(16%)      |" +String.format("%.2f", VAT));
        System.out.println("                                                 =============================");
        System.out.println("                                                 |Total Amount  |" + String.format("%.2f", totalAmount));
        System.out.println("                                                 =============================");
    }
}