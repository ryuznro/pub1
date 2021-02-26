public class Code06 {
    public static void main(String[] args) {
        int [] grades;
        grades = new int[5];

        grades[0] = 100;
        grades[1] = 99;
        grades[2] = 55;
        grades[3] = 4;
        grades[4] = 456;

        for(int i=0; i<grades.length; i++){
            System.out.println((1+i) + "th grade is "+ grades[i]);
        }
    }
}
