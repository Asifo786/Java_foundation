# Taking input in an array
```java
int[] arr = new int[size];
for(int i = 0; i < size; i++){
    arr[i] = scn.nextInt();
}
```

# Array Reference in Java
```java
int[] arr = {1,2,3,4,5};

int[] arr_copied = arr; // here 'arr_copied' copy the address of 'arr' not value;****
arr_copied[0] = 2;
arr_copied[1] = 5;

sout(arr);          // 2,5,3,4,5
sout(arr_copied);   // 2,5,3,4,5
```
