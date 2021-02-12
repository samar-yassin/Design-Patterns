public class robotAdapter implements IEnemy {
    robot tempRobot;
    robotAdapter(robot temp){
        tempRobot=temp;
    }

    @Override
    public void walk() {
        tempRobot.move();
    }

    @Override
    public void smashWithHand() {
        tempRobot.fireWithGun();
    }
}
