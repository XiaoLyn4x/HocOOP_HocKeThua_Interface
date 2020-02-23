package buiphuongnga.com.module;

public class SinhVien implements IGiaiTri, ILamViec {
	@Override
	public void complexity() {
		System.out.println("Công việc phức tạp");
	}

	@Override
	public void difficulty() {
		System.out.println("Công việc khó");
	}

	@Override
	public void hatHo() {
		System.out.println("Giải trí hát hò");
	}
}
