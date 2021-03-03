package unit1.pj1;

class employee {
    public static void main(String[] args) {

        int[] empolyeeNumber = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
        String[] employeeName = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay" };
        String[] joiningDate = { "01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "01/01/2000",
                "12/06/2006" };
        String[] desigCode = { "e", "c", "k", "r", "m", "e", "c" };
        String[] dept = { "R&D", "PM", "ACCT", "Front Desk", "Engg", "Manufacturing", "PM" };
        double[] basic = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
        double[] hra = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
        double[] IT = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };

        String Designation = null;
        int DA = 0;
        int flag = -1;
        int emp_id = Integer.parseInt(args[0]);
        for (int i = 0; i < empolyeeNumber.length; i++) {
            if (empolyeeNumber[i] == emp_id) {
                flag = i;
            }
        }

        if (flag == -1) {
            System.out.println();
            System.out.println("*************************************************************************");
            System.out.println("There is no Employee with " + emp_id + " id");
            System.out.println("*************************************************************************");

            System.out.println();
            System.out.println();
        } else {
            String designationCode = desigCode[flag];
            switch (designationCode) {
                case "e":
                    Designation = "Engineer";
                    DA = 20000;
                    break;
                case "c":
                    Designation = "Consultant";
                    DA = 32000;
                    break;
                case "k":
                    Designation = "Clerk";
                    DA = 12000;
                    break;
                case "r":
                    Designation = "Receptionist";
                    DA = 15000;
                    break;
            }
        }

        double Salary = basic[flag] + hra[flag] + DA - IT[flag];
        System.out.println();
        System.out.println("*************************************************************************");
        System.out.println("Javed Ali      18BCS6705");
        System.out.println("Emp No.          " + "Emp Name      " + "Dept          " + "Designation            "
                + "Salary                   ");
        System.out.println(empolyeeNumber[flag] + "             " + employeeName[flag] + "         " + dept[flag]
                + "          " + Designation + "       " + "         " + Salary);
        System.out.println("*************************************************************************");
    }
}
