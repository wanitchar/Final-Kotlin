fun main(){
    var myAnimal = Animal()
    myAnimal.makeNoise()
    myAnimal.eat()
    myAnimal.roam()
    myAnimal.sleep()
    var myHippo = Hippo()
    myHippo.makeNoise()
    myHippo.eat()
    var myFeline = Feline()
    myFeline.roam()
    var myLion = Lion()
    myLion.makeNoise()
    myLion.eat()
    var myCheetah = Cheetah()
    myCheetah.makeNoise()
    myCheetah.eat()
    var myLynx = Lynx()
    myLynx.makeNoise()
    myLynx.eat()
    var myCanine = Canine()
    myCanine.roam()
    var myWolf = Wolf()
    myWolf.makeNoise()
    myWolf.eat()
    var myFox = Fox()
    myFox.makeNoise()
    myFox.eat()
    println("สัตวแพทย์ฉีดยาสัตว์ทุกตัว")
    var myVet = Vet()
    myVet.giveShot(myHippo)
    myVet.giveShot(myLion)
    myVet.giveShot(myCheetah)
    myVet.giveShot(myLynx)
    myVet.giveShot(myWolf)
    myVet.giveShot(myFox)
}
open class Animal{
    open val image = ""
    open val food = ""
    open val habitat = ""
    open val hunger = ""
    var habiat = 10
    open fun makeNoise(){
        println("คลาส Animal กำลัง ส่งเสียงร้อง")
    }
    open fun eat(){
        println("คลาส Animal กำลัง กิน")
    }
    open fun roam(){
        println("คลาส Animal กำลัง เดิน")
    }
    open fun sleep(){
        println("คลาส Animal กำลัง นอน")
    }
}
class Hippo : Feline() {
    override val food = "หญ้า"
    override val habitat = "น้ำ"
    override val image = "Hippo.jpg"
    override fun makeNoise() {
        println("ฮิปโป ส่งเสียงร้อง ฮิปปี้ ฮิปปี้")
    }
    override fun eat() {
        println("ฮิปโปกิน $food")
    }
}
open class Feline : Animal(){
    override fun roam() {
        println("คลาส Feline กำลังเดินและปีนต้นไม้")
    }
}
class Lion : Feline() {
    override val image = "Lion.jpg"
    override val food = "เนื้อสัตว์"
    override val habitat = "ต้นไม้"
    override fun makeNoise() {
        println("สิงโต ส่งเสียงร้อง โฮร่กกก")
    }
    override fun eat() {
        println("สิงโตกิน $food")
    }
}
class Cheetah : Feline(){
    override val image = "Cheetah.jpg"
    override val food = "เนื้อสัตว์"
    override val habitat = "พุ่มไม้"
    override fun makeNoise() {
        println("ชีต้า ส่งเสียงร้อง กรรรร")
    }
    override fun eat() {
        println("ชีต้ากิน $food")
    }
}
class Lynx : Feline(){
    override val image = "Lynx.jpg"
    override val food = "เนื้อสัตว์"
    override val habitat = "ดงหญ้า"
    override fun makeNoise() {
        println("ลิ้น ส่งเสียงร้อง ม๊าววว")
    }
    override fun eat() {
        println("ลิ้นกิน $food")
    }
}
open class Canine : Animal(){
    override fun roam() {
        println("คลาส Canine กำลังเดิน")
    }
}
class Wolf : Canine(){
    override val image = "Wolf.jpg"
    override val food = "เนื้อสัตว์"
    override val habitat = "ป่า"
    override fun makeNoise() {
        println("หมาป่า ส่งเสียงร้อง บรู้วววว")
    }
    override fun eat() {
        println("หมาป่ากิน $food")
    }
}
class Fox : Canine(){
    override val image = "Fox.jpg"
    override val food = "เนื้อสัตว์"
    override val habitat = "ถ้ำ"
    override fun makeNoise() {
        println("สุนัขจิ้งจอก ส่งเสียงร้อง บ๊อก บ๊อก")
    }
    override fun eat() {
        println("สุนัขจิ้งจอกกิน $food")
    }
}
open class Vet : Animal(){
    fun giveShot(animal : Animal) {
        animal.makeNoise()
    }
}