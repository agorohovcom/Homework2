public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var summaryBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(summaryBoxersWeight);
        var differenceBoxersWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println(differenceBoxersWeight);

        var subtractionBoxersWeight = secondBoxerWeight - firstBoxerWeight;
        var divisionByRemainderBoxersWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println(subtractionBoxersWeight);
        System.out.println(divisionByRemainderBoxersWeight);

        var timeForWork = 640;
        var oneWorkerWorkTime = 8;
        var workersAmount = timeForWork / oneWorkerWorkTime;
        System.out.println("Всего работников в компании - "
                + workersAmount
                + " человек");

        workersAmount = workersAmount + 94;
        timeForWork = oneWorkerWorkTime * workersAmount;
        System.out.println("Если в компании работает "
                + workersAmount
                + " человек, то всего "
                + timeForWork
                + " часов работы может быть поделено между сотрудниками");
    }
}