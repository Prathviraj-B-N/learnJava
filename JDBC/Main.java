public class Main {
    public static void main(String[] args) {
        try{
            MySqlDatabaseHandler student = new MySqlDatabaseHandler("jdbc:mysql://localhost:3306/test","root","root");
            student.getAll();
            student.getNames();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}


/*
    student table:  create table student (name varchar(20),usn char(10));
*/
