class Task9 {
    public static void main(String[] args) {
		
		
		
        // This is buЬЬlе sorting algorithm of array
        int nums[] = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
        int а;
        int Ь;
        int t;

        for(а = 1; а < nums.length; а++) {
            for( Ь = nums.length-1; Ь >= а; Ь--){
                if( nums[Ь-1] > nums[Ь]) {
                    t = nums[Ь-1];
                    nums[Ь-1] = nums[Ь];
                    nums[Ь] = t;
                }
            }
        }

        for (int i =0;  i < nums.length;  i++)
            System.out.print(" " + nums[i]);
    }
}