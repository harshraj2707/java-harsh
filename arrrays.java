public class arrrays{
    public static void main(String[] args) {
        float [] marks = { 77,88,99,444,55};
        float num = 45;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("array");
        }
        else{
            System.out.println("not array");
        }

    }
}

