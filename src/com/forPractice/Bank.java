package com.forPractice;

interface Bank {
    float rateOfInterest();
}

class SBI implements Bank {
    @Override
    public float rateOfInterest() {
        return 9.16f;
    }

    class PNB implements Bank {
        @Override
        public float rateOfInterest() {
            return 9.7f;
        }

        class BankInterfaceDemo {
            public static void main(String[] args) {
                Bank b = new SBI();
                System.out.println("Rate of interest :" + b.rateOfInterest());
            }

        }
    }
}
