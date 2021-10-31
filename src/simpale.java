
 class Component {
     
      int data1;
      int data2;

    public Component(Builder builder) {
        this.data1 = builder.data1;
        this.data2 = builder.data2;
    }
      
      

    public  int getData1() {
        return data1;
    }

    public  int getData2() {
        return data2;
    }

    @Override
    public String toString() {
        return String.valueOf(data1+data2);
    }
    
      static class Builder{
          int data1;
          int data2;
          
          public Builder setData1(int data1){
              this.data1 = data1;
              return this;
          }
          public Builder setData2(int data2){
              this.data2 = data2;
              return this;
          }
          public Component build(){
              Component component = new Component(this);
              return component; 
          }
      }
}

class test {
    public static void main(String[] args) {
        Component.Builder builder = new Component.Builder();
        Component component = builder.setData1(10).setData2(20).build();
        System.out.println(component);
    }
}
