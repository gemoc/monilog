#include <MoniLog.h>

PYBIND11_EMBEDDED_MODULE(testinterface, m) { }

int main()
{
    std::vector<std::string> python_path = {"/home/leroyd/git/monilog/lab"};
    std::vector<std::string> python_scripts = {"testmoniloggers"};
    std::string interface_module = "testinterface";
    std::function<void (pybind11::module_, pybind11::object)> interface_module_initializer =
            [](pybind11::module_ iterativeheatequation_module, pybind11::object context_class) { };

    MoniLog::register_base_events({
        {"SomeEvent", 0},
        {"SomeOtherEvent", 1}
    });
    
    MoniLog::register_composite_event("SomeCompositeEvent", {"SomeEvent", "SomeOtherEvent"});

    std::shared_ptr<MoniLog::MoniLogExecutionContext> ctx(new MoniLog::MoniLogExecutionContext());

    MoniLog::bootstrap_monilog(python_path, python_scripts, interface_module, interface_module_initializer);

    MoniLog::trigger(0, ctx);
    MoniLog::trigger(1, ctx);

    MoniLog::trigger("SomeCompositeEvent", ctx);

}