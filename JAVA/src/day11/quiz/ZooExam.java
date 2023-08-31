package day11.quiz;

public class ZooExam {

	public static void main(String[] args) {
		ZooKeaper zk = new ZooKeaper();
		Lion lion = new Lion();
		Deer deer = new Deer();
		zk.feed(deer);
		zk.feed(lion);

	}

}
