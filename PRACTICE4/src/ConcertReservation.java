
// 4장 실습 12번
import java.util.*;

class ReservationSystem {
	Scanner sc = new Scanner(System.in);
	private String[] S = { "---", "---", "---", "---", "---", "---", "---", "---", "---", "---" };
	private String[] A = { "---", "---", "---", "---", "---", "---", "---", "---", "---", "---" };
	private String[] B = { "---", "---", "---", "---", "---", "---", "---", "---", "---", "---" };

	public void Reservation(int seat) {
		switch (seat) {
		case 1:
			System.out.print("S >> ");
			for (int i = 0; i < S.length; i++)
				System.out.print(S[i] + " ");
			System.out.println();

			System.out.print("이름 >> ");
			String sname = sc.next();
			System.out.print("번호 >> ");
			int snum = sc.nextInt();
			System.out.println();

			S[snum - 1] = sname;
			break;
		case 2:
			System.out.print("A >> ");
			for (int i = 0; i < A.length; i++)
				System.out.print(A[i] + " ");
			System.out.println();

			System.out.print("이름 >> ");
			String aname = sc.next();
			System.out.print("번호 >> ");
			int anum = sc.nextInt();
			System.out.println();

			A[anum - 1] = aname;
			break;
		case 3:
			System.out.print("B >> ");
			for (int i = 0; i < B.length; i++)
				System.out.print(B[i] + " ");
			System.out.println();

			System.out.print("이름 >> ");
			String bname = sc.next();
			System.out.print("번호 >> ");
			int bnum = sc.nextInt();
			System.out.println();

			B[bnum - 1] = bname;
			break;
		}
	}

	public void CheckSeat() {
		System.out.print("S >> ");
		for (int i = 0; i < S.length; i++)
			System.out.print(S[i] + " ");
		System.out.println();

		System.out.print("A >> ");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
		System.out.println();

		System.out.print("B >> ");
		for (int i = 0; i < B.length; i++)
			System.out.print(B[i] + " ");
		System.out.println();
	}

	public void CancleSeat(int cancle) {
		boolean bool = false;

		switch (cancle) {
		case 1:
			System.out.print("S >> ");
			for (int i = 0; i < S.length; i++)
				System.out.print(S[i] + " ");
			System.out.println();

			System.out.print("이름 >> ");
			String sname = sc.next();
			System.out.println();

			for (int i = 0; i < S.length; i++) {
				if (sname.equals(S[i])) {
					S[i] = "---";
					bool = true;
				}
			}

			break;
		case 2:
			System.out.print("A >> ");
			for (int i = 0; i < A.length; i++)
				System.out.print(A[i] + " ");
			System.out.println();

			System.out.print("이름 >> ");
			String aname = sc.next();
			System.out.println();

			for (int i = 0; i < A.length; i++) {
				if (aname.equals(A[i])) {
					A[i] = "---";
					bool = true;
				}
			}
			break;
		case 3:
			System.out.print("B >> ");
			for (int i = 0; i < B.length; i++)
				System.out.print(B[i] + " ");
			System.out.println();

			System.out.print("이름 >> ");
			String bname = sc.next();
			System.out.println();

			for (int i = 0; i < B.length; i++) {
				if (bname.equals(B[i])) {
					B[i] = "---";
					bool=true;
				}
			}

			break;
		}
		
		if(bool==false) {
			System.out.println("예약자가 없습니다.");
		}
	}
}

public class ConcertReservation {
	Scanner scanner = new Scanner(System.in);
	ReservationSystem res = new ReservationSystem();

	public ConcertReservation() {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while (true) {
			System.out.print("에약:1, 조회:2, 취소:3, 끝내기:4 >> ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("좌석 구분 S(1), A(2), B(3) >> ");
				int seat = scanner.nextInt();
				if (seat != 1 && seat != 2 && seat != 3) {
					System.out.println("다시 선택해주세요.");
					continue;
				}
				res.Reservation(seat);
				break;
			case 2:
				res.CheckSeat();
				System.out.println("<< 조회를 완료하였습니다. >>");
				System.out.println();
				break;
			case 3:
				System.out.print("좌석 S(1), A(2), B(3) >> ");
				int cancle = scanner.nextInt();
				res.CancleSeat(cancle);
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("다시 선택해주세요.");
				break;
			}
		}
	}

	public static void main(String[] args) {
		new ConcertReservation();
	}

}
