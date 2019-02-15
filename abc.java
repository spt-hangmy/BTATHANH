class SinhVien
{
	private String hoTen;
	private int tuoi;
	public SinhVien(){}
	public SinhVien(String hoTen, int tuoi)
	{
		this->hoTen = hoTen;
		this->tuoi = tuoi;
	}
	public String getHoTen()
	{
		return hoTen;
	}
	public int getTuoi()
	{
		return tuoi;
	}
	public void setHoTen(String hoTen)
	{
		this->hoTen = hoTen;
	}
	public void setTuoi(int tuoi)
	{
		this->tuoi = tuoi;
	}
	public string toString()
}
