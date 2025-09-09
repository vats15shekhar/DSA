import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Guidewire {

    public int solution(int[] A, String[] D) {
        // Implement your solution here

        HashMap<String, List<Integer>> transactions = new HashMap<>();
        List<Integer> SumAndCountForAMonth = new ArrayList<>();
        int newSum = 0;
        int cnt = 0;
        int finalSum = 0;
        String yyyymm = "";

        for(int i = 0; i < A.length; i++)
        {
            yyyymm = D[i].substring(0, 7);
            transactions.put(yyyymm, new ArrayList<Integer>());

            ArrayList<Integer> sumCnt = new ArrayList<>();
            sumCnt.add(0);
            sumCnt.add(0);
            transactions.put(yyyymm, sumCnt);
        }

        for(int i = 0 ; i < A.length ; i++){

            yyyymm = D[i].substring(0, 7);

            SumAndCountForAMonth =  transactions.get(yyyymm);
            newSum = SumAndCountForAMonth.get(0) + A[i];
            cnt = SumAndCountForAMonth.get(1) + 1;

            ArrayList<Integer> newSumCnt = new ArrayList<>();
            newSumCnt.add(newSum);
            newSumCnt.add(cnt);

            transactions.put(yyyymm, newSumCnt);

            finalSum += A[i];
        }

        for(int i = 1 ; i <= 12 ; i++)
        {
            String date = "2020-0" + i;

            if(i != 10 && i != 11 && i != 12 ){
                date = "2020-0" + i;
            }
            else{
                date = "2020-0" + i;
            }

            if(transactions.containsKey(date)){
                SumAndCountForAMonth = transactions.get(date);
                if(SumAndCountForAMonth.get(1) >= 3 && SumAndCountForAMonth.get(0) >= 100){
                    continue;
                }
                else{
                    finalSum -= 5;
                }
            }
            else {
                    finalSum -= 5;
                }
            }


        return finalSum;
    }
}
