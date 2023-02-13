package DoubtSession7;

public class Recurz_Twin {
    public static void main(String[] args){
        String ques = "AXA";
        System.out.println(TWIN(ques));

    }
    public static int TWIN(String ques){
        if (ques.length() < 3) {

            return 0;
        }
         int count = 0;

            if (ques.charAt(0)==ques.charAt(2)){
                count++;
            }
        count+=TWIN(ques.substring(1));
        return count;
        }

    }

