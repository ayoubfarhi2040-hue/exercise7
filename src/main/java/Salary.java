public interface Salary {
    double salaryToPayFarhi77491(double hoursFarhi77491, double rateFarhi77491);

    default double salaryForOvertimeFarhi77491(double overtimeHoursFarhi77491, double rateFarhi77491) {
        return overtimeHoursFarhi77491 * rateFarhi77491 * 1.5;
    }

    static boolean shouldReceiveBonusFarhi77491(int yearsOfExperienceFarhi77491) {
        return yearsOfExperienceFarhi77491 >= 5;
    }
}