/*
 * A test comment.
 */
var CONSTANT = "this should not change.";

function test(arg) {

    var one = 1;
    var two = {
        three : "three",
        four : function () {
            return this.three;
        },
        five : 5
    };

    return function () {

        return one + two.five + arg;
    };
}

function exceptions(choice) {

    switch (choice) {
        case 1:
            throw "1 ah ah ah aaaaah.";
            break;
        case "two":
            throw "two ah ah ah aaaaah.";
            break;
        default:
            throw "three ah ah aaaaah. Maybe.";
    }
}

function catcher(arg) {

    var three = CONSTANT ? "three" : 3;

    var choices = ["one", 2, three];

    try {

        for (var choice in choices) {

            if (!choices.hasOwnProperty(choice)) {

                // comment

                continue;
            }
            else {
                exceptions(choices[choice]);
            }
        }

    } catch (e) {

        console.error(e);

    } finally {

        console.log("some" + "thing");
    }
}

test(1);
catcher("blah");