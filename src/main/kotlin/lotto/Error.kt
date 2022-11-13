package lotto

enum class Error(
    val errorText: String,
) {
    NO_ERROR(""),
    ERROR_RANGE(ERROR_MSG_RANGE),
    ERROR_NUMERIC(ERROR_MSG_NUMERIC),
    ERROR_ZERO_MONEY(ERROR_MSG_ZERO_MONEY),
    ERROR_OVERLAPPED(ERROR_MSG_OVERLAPPED),
    ERROR_INPUT_MONEY(ERROR_MSG_INPUT_MONEY),
    ERROR_OVER_SIZE(ERROR_MSG_OVER_SIZE)
}