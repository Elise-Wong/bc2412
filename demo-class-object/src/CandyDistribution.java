import java.util.ArrayList;
import java.util.List;

public class CandyDistribution {
    private int totalCandies; // 總糖果數
    private int candiesGiven; // 已派發的糖果數

    // 建構子
    public CandyDistribution(int totalCandies) {
        this.totalCandies = totalCandies;
        this.candiesGiven = 0;
    }

    // 設置分數
    public int distributeCandies(int score) {
        int candiesToGive = 0;

        if (score > 80) {
            candiesToGive = 2; // 分數超過80分
        } else if (score >= 60 && score <= 79) {
            candiesToGive = 1; // 分數在60到79之間
        } else {
            candiesToGive = 0; // 分數低於60分
        }

        // 確保不超過總糖果數
        if (candiesGiven + candiesToGive > totalCandies) {
            candiesToGive = totalCandies - candiesGiven; // 調整到剩餘的糖果數
        }

        candiesGiven += candiesToGive; // 更新已派發的糖果數
        return candiesToGive; // 返回派發的糖果數量
    }
    
    public static void main(String[] args) {
        CandyDistribution distribution = new CandyDistribution(20);
        
        // 假設這是一組分數，可以修改以進行測試
        int[] scores = {85, 70, 50, 90, 30};
        List<Integer> candiesPerPerson = new ArrayList<>(); // 用來記錄每個人得到的糖果數量

        for (int score : scores) {
            int candies = distribution.distributeCandies(score); // 獲取派發的糖果數量
            
            if (candies > 0) {
                candiesPerPerson.add(candies); // 記錄分配的糖果數量
                System.out.println("這個人得到 " + candies + " 粒糖果。");
            } else {
                candiesPerPerson.add(0); // 記錄沒有得到糖果
                System.out.println("這個人沒有糖果可派發。");
            }
            
            // 檢查是否已經派發完所有糖果
            if (distribution.candiesGiven >= distribution.totalCandies) {
                System.out.println("已經派發完所有糖果。");
                break; // 如果已經派發完所有糖果，則退出迴圈
            }
        }

        // 顯示每個人得到的糖果數量
        System.out.println("每個人得到的糖果數量: " + candiesPerPerson);
    }
}