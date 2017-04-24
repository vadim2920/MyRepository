import java.util.Scanner;

class Binary {
	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		System.out.println("ВВЕДИ ЧИСЛО:");
		int num = text.nextInt();
		int num8 = num % 2;
		if (num8 == 1) num--;
		num /= 2;
		int num7 = num % 2;
		if (num7 == 1) num--;
		num /= 2;
		int num6 = num % 2;
		if (num6 == 1) num--;
		num /= 2;
		int num5 = num % 2;
		if (num5 == 1) num--;
		num /= 2;
		int num4 = num % 2;
		if (num4 == 1) num--;
		num /= 2;
		int num3 = num % 2;
		if (num3 == 1) num--;
		num /= 2;
		int num2 = num % 2;
		if (num2 == 1) num--;
		num /= 2;
		int num1 = num % 2;
		if (num1 == 1) num--;
		num /= 2;
		if (num > 0) System.out.println("ОШИБКА!");
		else {
			int[] nums = {num1, num2, num3, num4, num5, num6, num7, num8};
			System.out.print("Двоичный код вашего числа: ");
			System.out.print(nums[0]);
			System.out.print(nums[1]);
			System.out.print(nums[2]);
			System.out.print(nums[3]);
			System.out.print(nums[4]);
			System.out.print(nums[5]);
			System.out.print(nums[6]);
			System.out.println(nums[7] + ".");
		}
	}
}