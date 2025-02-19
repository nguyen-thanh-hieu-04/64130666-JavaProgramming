import java.util.ArrayList;

public class CT {

	/*public static void main(String[] args) {
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(2, "Bánh chuối", "Đồ ăn nhanh", "bc.jpg");
		sp1.setMaSP(1);
		sp1.setTenSP("Bia SG");
		sp1.setLoaiSP("Đồ uống có cồn");
		sp1.setAnhSP("sg.png");
		
		//in ra màn hình thong tin 2 sp
		String thongtinSP1 = sp1.toString();
		String thongtinSP2 = "Mã SP2 Là" + sp2.getMaSP();
		       thongtinSP2 += "Tên SP2 là" + sp2.getTenSP();
		
		System.out.println(thongtinSP1);
		System.out.println(thongtinSP2);

	} */
	public static void main(String[] args) {
		//khai bao danh sach san pham
		ArrayList<SanPham> dsSanPham;
		dsSanPham = new ArrayList<SanPham>();
		//nhap 3 san pham 
		SanPham sp1 = new SanPham(0, "Kem", "Giai khát", null);
		SanPham sp2 = new SanPham(1, "Cơm", "Đồ ăn", null);
		SanPham sp3 = new SanPham(2, "Phở", "Đồ ăn", null);
		//them vao ArrayList
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
		/*for (SanPham x: dsSanPham)
			System.out.println(x.toString());
		*/
		for (int i=0 ; i<dsSanPham.size(); i++) {
			SanPham sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
			
		
	}

}
