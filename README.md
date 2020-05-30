## Note about using this with Calva

This project is created with the figwheel-main template, which doesn't produce [Calva](https://calva.io/) Jack-in settings, currently. I recommend that you create your project yourself from the template so that you get the latest setup.

This is how you start the project in Calva and get the REPL connected:

0. Open the project root folder in VS Code
0. Issue the command **Calva: Start a Project REPL and Connect (a.k.a. Jack-in)**, `ctrl+alt+c ctrl+alt+j`
0. Select project type `Clojure CLI + figwheel main``
0. *Don't pick an alias* <- This trips many people up, the `:fig` alias doesn't start things in the way Calva needs
    * Wait for the REPL to start, the *Calva says* output pane will say: `Connected session: clj`
0. Select to start at least the `dev` cljs build (starting both builds is fine)
    * This will
        1. start Figwheel compiling the ClojureScript code for your app
        1. open the app in the web browser, essentially starting it and it's cljs REPL.
        1. make Calva ask which build's REPL you want to connect to
0. Select the `dev` build.

Now Calva is connected to your apps cljs REPL. *Calva says* will print: `Connected session: cljs, repl: dev`.

See https://calva.io/ about how to use Calva. And please don't hesitate to holler my (`@pez`) way in the `#calva` channel at the Clojurians Slack.

# fresh-figwheel-main.core

FIXME: Write a one-line description of your library/project.

## Overview

FIXME: Write a paragraph about the library/project and highlight its goals.

## Development

To get an interactive development environment run:

    clojure -A:fig:build

This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

    rm -rf target/public

To create a production build run:

	rm -rf target/public
	clojure -A:fig:min


## License

Copyright © 2018 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
