package practice06;

public class StudentTest {

	public static void main(String[] args) {
		Student[] students = new Student[6];
		students[0] = new JnderGraduate("갑",1000,"컴공",3,84,"날자 날어");
		students[1] = new JnderGraduate("갑",1000,"컴공",3,87,"돌고 돌아");
		students[2] = new Graduate("을",100,"전자공학",2,51,"교육 조교",0);
		students[3] = new Graduate("병",102,"세포생물",3,61,"연구 조교",0.8);
		students[4] = new Graduate("정",102,"멀티미디어",4,23,"조교",0.5);
		students[5] = new Graduate("정",102,"화학공학",2,88,"교육 조교",-1);
				
		for(Student s : students) {
			s.display();
			
		}
	}

}
