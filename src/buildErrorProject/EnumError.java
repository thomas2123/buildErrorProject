package buildErrorProject;

public enum EnumError {
	TEST(0);
	
	private int value;
	
	private EnumError(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
