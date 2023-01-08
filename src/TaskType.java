public enum TaskType {
    WORK, PERSONAL;

    static TaskType getTaskbyNumber(Integer id) {
        if (id == 2) {
            return WORK;
        }
        return PERSONAL;
    }
    }
