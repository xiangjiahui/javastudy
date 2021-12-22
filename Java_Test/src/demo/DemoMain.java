package demo;

//类作为成员变量类型，接口作为成员变量类型
public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("莱茵哈鲁特");
        hero.setAge(20);

        Weapon weapon = new Weapon();
        weapon.setCode("圣剑");
        hero.setWeapon(weapon);
//        hero.setSkill(new SkillImpl());   //使用单独定义的类

        //还可以使用匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("地爆天星");
//            }
//        };
//        hero.setSkill(skill);

        //进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("地爆天星");
            }
        });

        hero.attack();
        hero.skillAttack();
    }
}
