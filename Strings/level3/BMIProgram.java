package com.gla.Strings.level3;

public class BMIProgram {static String[][] calculateBMI(double[][] data) {
    String[][] result = new String[data.length][4];

    for (int i = 0; i < data.length; i++) {
        double weight = data[i][0];
        double heightM = data[i][1] / 100.0;

        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";

        result[i][0] = String.valueOf(data[i][1]); // height
        result[i][1] = String.valueOf(weight);
        result[i][2] = String.format("%.2f", bmi);
        result[i][3] = status;
    }
    return result;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height
        }

        String[][] res = calculateBMI(data);

        for (String[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }
}
