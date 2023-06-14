  public static void mini_calcu(int a){
        Scanner scan = new Scanner(System.in);

        a = Integer.parseInt(scan.nextLine());


        if(a == 1){

            int num1, num2, resp;
            System.out.println("Elegiste sumas, ingresa 2 datos");

            num1 = Integer.parseInt(scan.nextLine());

            num2 = Integer.parseInt(scan.nextLine());

            resp = num1 + num2;

            System.out.println("La suma es: "+resp);


        }
        if(a == 2){

            int num1, num2, resp;
            System.out.println("Elegiste restas, ingresa 2 datos");

            num1 = Integer.parseInt(scan.nextLine());

            num2 = Integer.parseInt(scan.nextLine());

            resp = num1 - num2;

            System.out.println("La resta es: "+resp);


        }
        if(a == 3){

            int num1, num2, resp;
            System.out.println("Elegiste sumas, ingresa 2 datos");

            num1 = Integer.parseInt(scan.nextLine());

            num2 = Integer.parseInt(scan.nextLine());

            resp = num1 / num2;

            System.out.println("La suma es: "+resp);


        }
        if(a == 4){

            int num1, num2, resp;
            System.out.println("Elegiste sumas, ingresa 2 datos");

            num1 = Integer.parseInt(scan.nextLine());

            num2 = Integer.parseInt(scan.nextLine());

            resp = num1 * num2;

            System.out.println("La suma es: "+resp);


        }


    }
