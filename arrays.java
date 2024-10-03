//public class arrays{
//    public static void main(String[] args) {
        //array has 3 method to show array
        //method 1
        //classroom of 5 students - store marks of all 5 students
        //int [] marks = new int[5];
        //marks[0] = 100;
        //marks[1] = 99;
        //marks[2] = 98;
        //marks[3] = 97;
        //marks[4] = 99;

        //System.out.println(marks[4]);
    //}
//}


//method 2
//public class arrays{
//    public static void main(String[] args) {
//        int[] marks;
//        marks = new int[5];
        //marks[0] = 100;
        //marks[1] = 99;
        //marks[2] = 98;
        //marks[3] = 97;
        //marks[4] = 99;

//    }
//}

//method 3
//public class arrays{
//    public static void main(String[] args) {
//        int [] marks = {88,89,55,45,74};
//        System.out.println(marks[2]);
//    }
//}

//arrays length
//public class arrays{
//    public static void main(String[] args) {
//        int[] marks = {100,22,33,99,55};
//        System.out.println(marks.length);
//    }
//}

//display array using loop

public class arrays{
    public static void main(String[] args) {
        int [] marks = { 100 , 122 ,155 ,55, 66};
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        
        //reverse arrays 
        for(int I = marks.length - 1;i>0;i--){
            System.out.println(marks[i]);

        }
            
        }
    }
}

