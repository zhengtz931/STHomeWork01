public class SMTest {
    public static void main(String[] args) {
        StudentManage studentManage = new StudentManage();
        studentManage.addStudunt(1,"郑天泽","1994125",true);
        studentManage.findStudent("郑天泽");
        studentManage.xiugaiStudent("郑天泽");
        studentManage.findAll();
        studentManage.tuichu();
    }
}
