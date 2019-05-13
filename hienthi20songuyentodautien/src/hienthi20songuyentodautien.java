public class hienthi20songuyentodautien {
    public static void main(String[] args) {
        int N=2;
        boolean flag=true;
        int count=0;
        for (int i=0;i>=0;i++){
            for (int j=2;j<N;j++){
                if (N%j==0){
                    flag=false;
                    break;
                }else {
                    flag=true;
                }

            }
            if (flag==true){
                System.out.println(N);
                count++;
            }
            N++;
            flag=true;
            if (count==20){
                break;
            }
        }



    }
}
