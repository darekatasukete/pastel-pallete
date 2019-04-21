package backend;

import message.*;

class UserDatabaseText extends UserDatabase {

    @Override
    SignInResponse signIn(SignInRequest request) {
        return null;
    }

    @Override
    SignUpResponse signUp(SignUpRequest request) {
        return null;
    }

    @Override
    LogOutResponse logOut(LogOutRequest request) {
        return null;
    }

    @Override
    StartTalkResponse startTalk(StartTalkRequest request) {
        return null;
    }

    @Override
    EndTalkResponse endTalk(EndTalkRequest request) {
        return null;
    }

    @Override
    String anotherTalkerOf(String user) {
        return "Pastel-Palette";
    }

    @Override
    UserStatus getUserStatus(String user) {
        return UserStatus.PVE_TALKING;
    }
}
