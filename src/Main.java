public class Main {
    public static void main(String[] args) {
        // �������� ������� "1.2 ����������"
        // ������� �1
        int pen = 3;
        byte pencil = 6;
        short shortPen = 1;
        long longPencil = 5l;
        double weightShortPen = 0.05;
        float weightLongPencil = 0.11f;
        boolean wtf = weightShortPen > 0.01;
        char ampersand = 38;

        // ������� �2
        double boxer_1 = 78.2, boxer_2 = 82.7;
        double weightBoxers = boxer_1 + boxer_2;
        double weightDifference = boxer_2 - boxer_1;
        System.out.println("");
        System.out.println("����� ��� ��������: " + weightBoxers);
        System.out.println("������� � ���� ��������: " + weightDifference);

        // ������� �3
        int kBananas = 5;
        int weightBanana = 80;
        int kMilk = 200;
        int weightMilk = 105;
        int kIceCream = 2;
        int weightIceCream = 100;
        int kEggs = 4;
        int weightEgg = 70;
        int weightBreakfast = (kBananas * weightBanana) + (kMilk * weightMilk) + (kIceCream * weightIceCream) + (kEggs * weightEgg);
        int grToKg = 1000;
        float weightBreakfastKG = weightBreakfast/(float)grToKg;
        System.out.println("");
        System.out.println("����� ��� �������� � ������� - " + weightBreakfast + ", � ����������� - " + weightBreakfastKG);

        // ������� �4
        int minSbros = 250;
        int maxSbros = 500;
        int goalLoseWeightKG = 7;
        int kgTOgr = 1000;
        int goalLoseWeightGR = goalLoseWeightKG*kgTOgr;
        int minPeriod = goalLoseWeightGR / maxSbros;
        int maxPeriod = goalLoseWeightGR / minSbros;
        int midPeriod1 = (minPeriod + maxPeriod) / 2;
        int midSbros = (minSbros+maxSbros)/2;
        float midPeriod2 = (float)goalLoseWeightGR / (float)midSbros;
        System.out.println("");
        System.out.println("����������� ���� ���������: " + minPeriod + " ����(����), ������������ ���� ���������: " + maxPeriod + " ����(����)");
        System.out.println("������� ���� ��������� 1: " + midPeriod1 + " ����(����), ������� ���� ��������� 2: " + midPeriod2 + " ����(����)");


        // ������� 5
        int marySalary = 67_760;
        int denSalary = 83_690;
        int krisSalary = 76_230;
        float k = 10f / 100f;
        int newMarySalary = marySalary + (int)((float)marySalary * k);
        int newDenSalary = denSalary + (int)((float)denSalary * k);
        int newKrisSalary = krisSalary + (int)((float)krisSalary * k);
        int yearsMarySalary = marySalary * 12;
        int yearsDenSalary = denSalary * 12;
        int yearsKrisSalary = krisSalary * 12;
        int newYearsMarySalary = newMarySalary * 12;
        int newYearsDenSalary = newDenSalary * 12;
        int newYearsKrisSalary = newKrisSalary * 12;
        int difYearsMarySalary = newYearsMarySalary - yearsMarySalary;
        int difYearsDenSalary = newYearsDenSalary - yearsDenSalary;
        int difYearsKrisSalary = newYearsKrisSalary - yearsKrisSalary;
        System.out.println("");
        System.out.println("���� ������ �������� " + newMarySalary + " ������. ������� ����� ����� �� " + difYearsMarySalary + " ������");
        System.out.println("����� ������ �������� " + newDenSalary + " ������. ������� ����� ����� �� " + difYearsDenSalary + " ������");
        System.out.println("�������� ������ �������� " + newKrisSalary + " ������. ������� ����� ����� �� " + difYearsKrisSalary + " ������");

    }
}