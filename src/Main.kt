fun main(args: Array<String>) {
    val arraytoq = arrayOf(1,2,3,4,5,6,7,8,9,10,11)
    val arrayjuft = arrayOf(1,2,3,4,5,6,7,8,9,10,11)
    var res=0
    var res1=0
for (i in arraytoq.indices) {
    if (arraytoq[i] % 2 == 1) {

        res += arraytoq[i]
    }else if (arrayjuft[i]%2==0){
        res1+=arrayjuft[i]
    }


}
    println(res)
    println(res1)
}