public class Dept {
    private Employee [] e = new Employee[10] ;
    private int NumberOfEmployees = -1;

    public int Expenditure(){
        int sum = 0;
        for(int i=0;i<NumberOfEmployees+1;i++){
            sum += e[i].getSalary();
        }
        return sum;
    }
    public void Add(Employee src){
        NumberOfEmployees++;
        e[NumberOfEmployees]= src;
    }
    public void Remove(Employee src){
        for(int i =0;i<NumberOfEmployees+1;i++){
            if(src.getId() == i+1){
                for(int j = i;j<NumberOfEmployees;j++){
                    e[j] = e[j+1];
                }
                NumberOfEmployees--;
            }
        }
    }
    public void Disp(){
        for(int i=0;i<NumberOfEmployees+1;i++){
            e[i].Display();
        }
    }
}
