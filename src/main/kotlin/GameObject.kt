class GameObject {
    var x = 0
        // implicit backing 'field' generated by compiler
        get() = field
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    var y: Int = 0
        get() = field
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    private var _background: String? = null
    var background: String?
        get() {
            if (_background == null){
                _background = "blue"
            }
            return _background
        }
        set(value) {_background}
}

fun main() {
    var gameOne = GameObject()
    gameOne.x = 100
    gameOne.y = -10
    println(gameOne.x)
    println(gameOne.y)
    println(gameOne.background)
}