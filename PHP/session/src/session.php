<?php 

    namespace session;

    class Session {

        public function __construct(int $id, string $email, bool $adm) {
            session_start();

            $_SESSION['id'] = $id;
            $_SESSION['email'] = $email;
            $_SESSION['adm'] = $adm;
            $_SESSION['logged'] = true;
        }

        public static function isLogged () : bool {
            if (!$_SESSION['logged']) {
                echo 'please, do your login';
                return false;
            } else {
                if($_SESSION['logged'] === false) {
                    echo 'please, do your login. ';
                    return false;
                } else {
                    echo 'content';
                    return true;
                }
            }
        }

        public static function isAdm () : void {
            if (Session::isLogged() === false) {
                echo 'please, to enter in this page, do login with all privilegies';
            } else {
                if ($_SESSION['adm'] === false) {
                    echo 'you is not authorized to enter in this website';
                } else {
                    echo 'welcome adm';
                }
            }
        }
    }
