public class ArrayOfObjects {
    int RollNo;
    String Name;
    int Age;

    public static void main(String[] args){
        

        ArrayOfObjects s1 = new ArrayOfObjects();
        ArrayOfObjects s2 = new ArrayOfObjects();
        ArrayOfObjects s3 = new ArrayOfObjects();

        s1.RollNo = 1;
        s1.Name = "Karthik";
        s1.Age = 20;

        s2.RollNo = 2;
        s2.Name = "Vara Parasad";
        s2.Age = 19;

        s3.RollNo = 3;
        s3.Name = "Anji";
        s3.Age = 18;

        ArrayOfObjects[] arr = new ArrayOfObjects[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i].RollNo + " " + arr[i].Name + " " + arr[i].Age);
        }
    }
}
