import sys

def suggest_refactor(file_path):
    print(f"🧹 Analyzing legacy code in: {file_path}")
    print("💡 Suggestion: Replace 'var' with 'const/let'.")
    print("💡 Suggestion: Extract oversized function into smaller modules.")
    print("💡 Suggestion: Convert callback pattern to Async/Await.")

if __name__ == "__main__":
    file = sys.argv[1] if len(sys.argv) > 1 else "legacy_app.js"
    suggest_refactor(file)
